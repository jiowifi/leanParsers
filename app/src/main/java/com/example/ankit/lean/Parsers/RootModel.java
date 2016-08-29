import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String end_time;
	public String topic;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String organizer_name;
	public VersionModel _version;
	public String code_of_conduct;
	public String type;
	public String description;
	public CopyrightModel _copyright;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String privacy;
	public String organizer_description;
	public String email;
	public String name;
	public int id;
	public String background_image;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String state;

	public RootModel(String start_time, String end_time, String topic, CreatorModel creator, String schedule_published_on, String organizer_name, VersionModel version, String code_of_conduct, String type, String description, CopyrightModel copyright, String logo, Call_for_papersModel call_for_papers, String location_name, String privacy, String organizer_description, String email, String name, int id, String background_image, String timezone, ArrayList<Social_linksModel> social_links, String state) {

		this.start_time = start_time;
		this.end_time = end_time;
		this.topic = topic;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.description = description;
		this._copyright = copyright;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.email = email;
		this.name = name;
		this.id = id;
		this.background_image = background_image;
		this.timezone = timezone;
		this.social_links = social_links;
		this.state = state;

	}

}