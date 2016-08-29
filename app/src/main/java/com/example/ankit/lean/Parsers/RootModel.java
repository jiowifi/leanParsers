import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String name;
	public int id;
	public String email;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public VersionModel _version;
	public String logo;
	public String state;
	public String type;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String topic;
	public String background_image;
	public String end_time;
	public String organizer_name;
	public String privacy;
	public String location_name;
	public String code_of_conduct;

	public RootModel(String timezone, String name, int id, String email, String schedule_published_on, ArrayList<Social_linksModel> social_links, String organizer_description, String start_time, Call_for_papersModel call_for_papers, String description, VersionModel version, String logo, String state, String type, CreatorModel creator, CopyrightModel copyright, String topic, String background_image, String end_time, String organizer_name, String privacy, String location_name, String code_of_conduct) {

		this.timezone = timezone;
		this.name = name;
		this.id = id;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._version = version;
		this.logo = logo;
		this.state = state;
		this.type = type;
		this._creator = creator;
		this._copyright = copyright;
		this.topic = topic;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;

	}

}