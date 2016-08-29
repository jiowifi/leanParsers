import java.util.ArrayList;

class RootModel {

	public String end_time;
	public int id;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public String state;
	public String privacy;
	public String schedule_published_on;
	public String email;
	public String start_time;
	public String type;
	public String location_name;
	public String description;
	public String logo;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String background_image;
	public String organizer_description;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public CreatorModel _creator;

	public RootModel(String end_time, int id, String code_of_conduct, String organizer_name, String topic, String state, String privacy, String schedule_published_on, String email, String start_time, String type, String location_name, String description, String logo, String name, Call_for_papersModel call_for_papers, String timezone, String background_image, String organizer_description, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, VersionModel version, CreatorModel creator) {

		this.end_time = end_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.state = state;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.start_time = start_time;
		this.type = type;
		this.location_name = location_name;
		this.description = description;
		this.logo = logo;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.social_links = social_links;
		this._version = version;
		this._creator = creator;

	}

}