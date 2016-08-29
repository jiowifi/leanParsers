import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String email;
	public String topic;
	public CreatorModel _creator;
	public String background_image;
	public String type;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public int id;
	public String logo;
	public String state;
	public String organizer_name;
	public String location_name;
	public String schedule_published_on;
	public String description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String start_time;
	public String code_of_conduct;
	public String organizer_description;
	public String name;

	public RootModel(String end_time, String email, String topic, CreatorModel creator, String background_image, String type, VersionModel version, ArrayList<Social_linksModel> social_links, String privacy, int id, String logo, String state, String organizer_name, String location_name, String schedule_published_on, String description, String timezone, Call_for_papersModel call_for_papers, CopyrightModel copyright, String start_time, String code_of_conduct, String organizer_description, String name) {

		this.end_time = end_time;
		this.email = email;
		this.topic = topic;
		this._creator = creator;
		this.background_image = background_image;
		this.type = type;
		this._version = version;
		this.social_links = social_links;
		this.privacy = privacy;
		this.id = id;
		this.logo = logo;
		this.state = state;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.name = name;

	}

}