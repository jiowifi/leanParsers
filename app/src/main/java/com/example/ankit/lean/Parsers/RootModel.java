import java.util.ArrayList;

class RootModel {

	public int id;
	public String type;
	public String topic;
	public String description;
	public String end_time;
	public String name;
	public String location_name;
	public String state;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String privacy;
	public String start_time;
	public String timezone;
	public String organizer_name;
	public String background_image;
	public CreatorModel _creator;
	public String logo;
	public VersionModel _version;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String email;

	public RootModel(int id, String type, String topic, String description, String end_time, String name, String location_name, String state, CopyrightModel copyright, String code_of_conduct, Call_for_papersModel call_for_papers, String organizer_description, String privacy, String start_time, String timezone, String organizer_name, String background_image, CreatorModel creator, String logo, VersionModel version, String schedule_published_on, ArrayList<Social_linksModel> social_links, String email) {

		this.id = id;
		this.type = type;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;
		this.name = name;
		this.location_name = location_name;
		this.state = state;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._creator = creator;
		this.logo = logo;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.email = email;

	}

}