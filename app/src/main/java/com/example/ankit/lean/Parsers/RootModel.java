import java.util.ArrayList;

class RootModel {

	public String email;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String timezone;
	public String topic;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public VersionModel _version;
	public String code_of_conduct;
	public String type;
	public CopyrightModel _copyright;
	public String privacy;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String start_time;
	public String background_image;
	public String logo;
	public String organizer_description;
	public String location_name;
	public String organizer_name;
	public String name;

	public RootModel(String email, String schedule_published_on, CreatorModel creator, String timezone, String topic, int id, ArrayList<Social_linksModel> social_links, String state, VersionModel version, String code_of_conduct, String type, CopyrightModel copyright, String privacy, String end_time, Call_for_papersModel call_for_papers, String description, String start_time, String background_image, String logo, String organizer_description, String location_name, String organizer_name, String name) {

		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.timezone = timezone;
		this.topic = topic;
		this.id = id;
		this.social_links = social_links;
		this.state = state;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._copyright = copyright;
		this.privacy = privacy;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.start_time = start_time;
		this.background_image = background_image;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.name = name;

	}

}