import java.util.ArrayList;

class RootModel {

	public String type;
	public String logo;
	public String end_time;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String organizer_description;
	public String code_of_conduct;
	public String start_time;
	public VersionModel _version;
	public String location_name;
	public String timezone;
	public String schedule_published_on;
	public String email;
	public String privacy;
	public String organizer_name;
	public String topic;
	public String description;
	public int id;
	public String name;
	public String background_image;
	public CreatorModel _creator;

	public RootModel(String type, String logo, String end_time, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String state, String organizer_description, String code_of_conduct, String start_time, VersionModel version, String location_name, String timezone, String schedule_published_on, String email, String privacy, String organizer_name, String topic, String description, int id, String name, String background_image, CreatorModel creator) {

		this.type = type;
		this.logo = logo;
		this.end_time = end_time;
		this._copyright = copyright;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._version = version;
		this.location_name = location_name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.description = description;
		this.id = id;
		this.name = name;
		this.background_image = background_image;
		this._creator = creator;

	}

}