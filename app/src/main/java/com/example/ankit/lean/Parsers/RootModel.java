import java.util.ArrayList;

class RootModel {

	public String state;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String logo;
	public String background_image;
	public String location_name;
	public String schedule_published_on;
	public String timezone;
	public String end_time;
	public VersionModel _version;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String privacy;
	public String email;
	public CreatorModel _creator;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public int id;
	public String start_time;
	public String type;
	public String topic;

	public RootModel(String state, CopyrightModel copyright, String code_of_conduct, String logo, String background_image, String location_name, String schedule_published_on, String timezone, String end_time, VersionModel version, String description, ArrayList<Social_linksModel> social_links, String organizer_description, String privacy, String email, CreatorModel creator, String organizer_name, Call_for_papersModel call_for_papers, String name, int id, String start_time, String type, String topic) {

		this.state = state;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.background_image = background_image;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.end_time = end_time;
		this._version = version;
		this.description = description;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.email = email;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.id = id;
		this.start_time = start_time;
		this.type = type;
		this.topic = topic;

	}

}