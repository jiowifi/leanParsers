import java.util.ArrayList;

class RootModel {

	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String organizer_name;
	public String email;
	public String logo;
	public String topic;
	public String end_time;
	public int id;
	public String timezone;
	public String background_image;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String organizer_description;
	public String schedule_published_on;
	public String description;
	public String location_name;
	public String privacy;
	public String name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String code_of_conduct;

	public RootModel(String start_time, ArrayList<Social_linksModel> social_links, String type, String organizer_name, String email, String logo, String topic, String end_time, int id, String timezone, String background_image, String state, Call_for_papersModel call_for_papers, CreatorModel creator, String organizer_description, String schedule_published_on, String description, String location_name, String privacy, String name, CopyrightModel copyright, VersionModel version, String code_of_conduct) {

		this.start_time = start_time;
		this.social_links = social_links;
		this.type = type;
		this.organizer_name = organizer_name;
		this.email = email;
		this.logo = logo;
		this.topic = topic;
		this.end_time = end_time;
		this.id = id;
		this.timezone = timezone;
		this.background_image = background_image;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.location_name = location_name;
		this.privacy = privacy;
		this.name = name;
		this._copyright = copyright;
		this._version = version;
		this.code_of_conduct = code_of_conduct;

	}

}