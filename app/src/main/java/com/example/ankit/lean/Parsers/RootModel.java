import java.util.ArrayList;

class RootModel {

	public String name;
	public String type;
	public int id;
	public String start_time;
	public String end_time;
	public VersionModel _version;
	public String description;
	public String privacy;
	public String organizer_name;
	public String logo;
	public String topic;
	public String background_image;
	public String location_name;
	public String email;
	public String timezone;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String code_of_conduct;
	public CreatorModel _creator;

	public RootModel(String name, String type, int id, String start_time, String end_time, VersionModel version, String description, String privacy, String organizer_name, String logo, String topic, String background_image, String location_name, String email, String timezone, CopyrightModel copyright, String schedule_published_on, String organizer_description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String state, String code_of_conduct, CreatorModel creator) {

		this.name = name;
		this.type = type;
		this.id = id;
		this.start_time = start_time;
		this.end_time = end_time;
		this._version = version;
		this.description = description;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.topic = topic;
		this.background_image = background_image;
		this.location_name = location_name;
		this.email = email;
		this.timezone = timezone;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;

	}

}