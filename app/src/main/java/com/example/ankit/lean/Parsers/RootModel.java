import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_name;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String schedule_published_on;
	public String end_time;
	public VersionModel _version;
	public String organizer_description;
	public String topic;
	public String start_time;
	public String privacy;
	public String description;
	public CreatorModel _creator;
	public String state;
	public String background_image;
	public String timezone;
	public String logo;
	public String type;
	public String name;

	public RootModel(String code_of_conduct, Call_for_papersModel call_for_papers, CopyrightModel copyright, int id, String organizer_name, String location_name, ArrayList<Social_linksModel> social_links, String email, String schedule_published_on, String end_time, VersionModel version, String organizer_description, String topic, String start_time, String privacy, String description, CreatorModel creator, String state, String background_image, String timezone, String logo, String type, String name) {

		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.id = id;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.social_links = social_links;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._version = version;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.start_time = start_time;
		this.privacy = privacy;
		this.description = description;
		this._creator = creator;
		this.state = state;
		this.background_image = background_image;
		this.timezone = timezone;
		this.logo = logo;
		this.type = type;
		this.name = name;

	}

}