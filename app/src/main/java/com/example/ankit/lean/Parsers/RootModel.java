import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String state;
	public String logo;
	public String type;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String schedule_published_on;
	public String topic;
	public VersionModel _version;
	public String background_image;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String description;
	public String end_time;
	public CreatorModel _creator;
	public String privacy;
	public String location_name;
	public int id;
	public String email;
	public String organizer_name;
	public String organizer_description;

	public RootModel(Call_for_papersModel call_for_papers, String timezone, String state, String logo, String type, String start_time, ArrayList<Social_linksModel> social_links, String name, String schedule_published_on, String topic, VersionModel version, String background_image, String code_of_conduct, CopyrightModel copyright, String description, String end_time, CreatorModel creator, String privacy, String location_name, int id, String email, String organizer_name, String organizer_description) {

		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.state = state;
		this.logo = logo;
		this.type = type;
		this.start_time = start_time;
		this.social_links = social_links;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._version = version;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.description = description;
		this.end_time = end_time;
		this._creator = creator;
		this.privacy = privacy;
		this.location_name = location_name;
		this.id = id;
		this.email = email;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;

	}

}