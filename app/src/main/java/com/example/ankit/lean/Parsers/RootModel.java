import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String schedule_published_on;
	public String state;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String background_image;
	public String start_time;
	public String location_name;
	public String topic;
	public VersionModel _version;
	public String type;
	public String description;
	public String end_time;
	public String email;
	public int id;
	public CopyrightModel _copyright;
	public String organizer_name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String logo;
	public String organizer_description;

	public RootModel(String privacy, String schedule_published_on, String state, String timezone, Call_for_papersModel call_for_papers, String code_of_conduct, String background_image, String start_time, String location_name, String topic, VersionModel version, String type, String description, String end_time, String email, int id, CopyrightModel copyright, String organizer_name, CreatorModel creator, ArrayList<Social_linksModel> social_links, String name, String logo, String organizer_description) {

		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.start_time = start_time;
		this.location_name = location_name;
		this.topic = topic;
		this._version = version;
		this.type = type;
		this.description = description;
		this.end_time = end_time;
		this.email = email;
		this.id = id;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.social_links = social_links;
		this.name = name;
		this.logo = logo;
		this.organizer_description = organizer_description;

	}

}