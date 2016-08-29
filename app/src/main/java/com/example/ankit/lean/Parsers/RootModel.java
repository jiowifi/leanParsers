import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public CreatorModel _creator;
	public String logo;
	public String start_time;
	public String state;
	public String email;
	public String schedule_published_on;
	public VersionModel _version;
	public String end_time;
	public String background_image;
	public CopyrightModel _copyright;
	public String description;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String name;
	public String code_of_conduct;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String timezone;
	public int id;
	public String type;

	public RootModel(String organizer_name, CreatorModel creator, String logo, String start_time, String state, String email, String schedule_published_on, VersionModel version, String end_time, String background_image, CopyrightModel copyright, String description, String topic, Call_for_papersModel call_for_papers, String location_name, String name, String code_of_conduct, String privacy, ArrayList<Social_linksModel> social_links, String organizer_description, String timezone, int id, String type) {

		this.organizer_name = organizer_name;
		this._creator = creator;
		this.logo = logo;
		this.start_time = start_time;
		this.state = state;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.end_time = end_time;
		this.background_image = background_image;
		this._copyright = copyright;
		this.description = description;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.id = id;
		this.type = type;

	}

}