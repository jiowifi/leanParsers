import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String state;
	public String topic;
	public CopyrightModel _copyright;
	public String name;
	public String email;
	public String privacy;
	public String code_of_conduct;
	public String organizer_description;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String end_time;
	public String location_name;
	public VersionModel _version;
	public String background_image;
	public String logo;
	public String description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public int id;
	public String start_time;

	public RootModel(String timezone, String state, String topic, CopyrightModel copyright, String name, String email, String privacy, String code_of_conduct, String organizer_description, CreatorModel creator, Call_for_papersModel call_for_papers, String type, String end_time, String location_name, VersionModel version, String background_image, String logo, String description, String organizer_name, ArrayList<Social_linksModel> social_links, String schedule_published_on, int id, String start_time) {

		this.timezone = timezone;
		this.state = state;
		this.topic = topic;
		this._copyright = copyright;
		this.name = name;
		this.email = email;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.end_time = end_time;
		this.location_name = location_name;
		this._version = version;
		this.background_image = background_image;
		this.logo = logo;
		this.description = description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.start_time = start_time;

	}

}