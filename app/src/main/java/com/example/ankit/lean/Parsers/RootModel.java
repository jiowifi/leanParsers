import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String logo;
	public String timezone;
	public String location_name;
	public String code_of_conduct;
	public String organizer_description;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String topic;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String description;
	public String name;
	public String background_image;
	public CreatorModel _creator;
	public String type;
	public String privacy;
	public String email;
	public VersionModel _version;
	public String state;

	public RootModel(String organizer_name, String logo, String timezone, String location_name, String code_of_conduct, String organizer_description, int id, Call_for_papersModel call_for_papers, String schedule_published_on, CopyrightModel copyright, String topic, String start_time, ArrayList<Social_linksModel> social_links, String end_time, String description, String name, String background_image, CreatorModel creator, String type, String privacy, String email, VersionModel version, String state) {

		this.organizer_name = organizer_name;
		this.logo = logo;
		this.timezone = timezone;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.topic = topic;
		this.start_time = start_time;
		this.social_links = social_links;
		this.end_time = end_time;
		this.description = description;
		this.name = name;
		this.background_image = background_image;
		this._creator = creator;
		this.type = type;
		this.privacy = privacy;
		this.email = email;
		this._version = version;
		this.state = state;

	}

}